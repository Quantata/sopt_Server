package sopt.org.seminar2_assignment.api;

import org.springframework.web.bind.annotation.*;
import sopt.org.seminar2_assignment.model.User;

import java.text.SimpleDateFormat;
import java.util.*;

@RestController
public class UserController {

    protected final static List<User> userList = new LinkedList<>();

    public void setUsers(){
        if(userList.size() == 0 ){
            userList.add(new User(123, "가가가", "서버"));
            userList.add(new User(456, "나나나", "안드로이드"));
            userList.add(new User(789, "다다다", "IOS"));
            userList.add(new User(101, "라라라", "디자인"));
        }

    }

    //현재 시간
    @GetMapping("")
    public String getTime(){
        long now = System.currentTimeMillis();

        Date date = new Date(now);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());

        String time = sdf.format(date);

        return time;
    }

    /**
     * 모든 회원 리스트 조회
     * 이름으로 회원 리스트 조회
     * 파트로 회원 리스트 조회
     * @return 회원 리스트
     */
    @GetMapping("/users")
    public List searchUser(@RequestParam(value = "name", defaultValue = "") String name,
                           @RequestParam(value = "part", defaultValue = "") String part){
        setUsers();
        List mUserList = new LinkedList();

        if (name.equals("")&&part.equals("")) { // part, name 둘다 defaultValue
            mUserList.add(userList);
        }
        else if (!name.equals("")) { // name value가 defaultValue가 아니라면
            for (User userName : userList) {
                if (userName.getName().equals(name)) { //userList의 name과 입력받은 name 비교
                    mUserList.add(userName);
                }
            }
            if(mUserList.size()==0){
                mUserList.add("없습니다");
            }
        }

        if(!part.equals("")){ //part가 defaultValue가 아니면
            for(User userPart : userList){
                if (userPart.getPart().equals(part)) {
                    mUserList.add(userPart);
                }
            }
            if(mUserList.size()==0){
                mUserList.add("없습니다");
            }
        }

        return mUserList;
    }

    //user_idx로 회원 검색
    @GetMapping("users/{user_idx}")
    public List searchUser_Idx(@PathVariable(value = "user_idx") int user_idx){
        setUsers();
        List mUserList = new LinkedList();

        for(User userIdx : userList){
            if(userIdx.getUser_idx() == user_idx){
                mUserList.add(userIdx);
            }
        }

        return mUserList;
    }

    @RequestMapping("users/{user_idx}")
    @PutMapping("")
//    @DeleteMapping("")
    public User ModifyUser(@RequestBody final User user){

        for(int i = 0; i<userList.size(); i++){

            if(userList.get(i).getUser_idx() == user.getUser_idx()){
//              userList.get(i).setUser_idx(user.getUser_idx());
                userList.get(i).setName(user.getName());
                userList.get(i).setPart(user.getPart());
            }
        }
        return user;
    }

    @RequestMapping("/users")
    @PostMapping("")
    public User saveUser(@RequestBody User user){

        userList.add(new User(user.getUser_idx(), user.getName(), user.getPart()));
        return user;
    }


    //Delete를 해야함
//    @RequestMapping("/users/{user_idx}")
//    @DeleteMapping("")
//    public User deleteUser(@RequestBody final User user){
//
//        for(int i = 0; i<userList.size(); i++){
//
//            if(userList.get(i).getUser_idx() == user.getUser_idx()){
//                userList.remove(userList.get(i));
//            }
//        }
//        return user;
//    }
}

