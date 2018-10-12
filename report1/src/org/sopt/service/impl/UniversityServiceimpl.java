package org.sopt.service.impl;

import org.sopt.model.University;
import org.sopt.model.builder.UniversityBuilder;
import org.sopt.service.UniversityService;

public class UniversityServiceimpl implements UniversityService {
    @Override
    public University getByUniName(String uniName) {
        UniversityBuilder universityBuilder = new UniversityBuilder();
        University university = universityBuilder
                .build();
        return university;
    }

//    @Override
//    public University getByUniName(String getByUniName) {
//        //return null;
//
//        return new University();
//    }
}
