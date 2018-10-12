package org.sopt.service.impl;

import org.sopt.model.Professor;
import org.sopt.model.builder.ProfessorBuilder;
import org.sopt.service.ProfessorService;

public class ProfessorServiceimpl implements ProfessorService {
    @Override
    public Professor getByProId(int proId) {
//        return null;
        ProfessorBuilder professorBuilder = new ProfessorBuilder();
        Professor professor = professorBuilder
                .build();

        return professor;
    }
}
