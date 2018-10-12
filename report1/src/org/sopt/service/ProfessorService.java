package org.sopt.service;

import org.sopt.model.Professor;

public interface ProfessorService {
    Professor getByProId(final int proId);
}
