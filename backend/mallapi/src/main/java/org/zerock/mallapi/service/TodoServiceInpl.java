package org.zerock.mallapi.service;

import org.springframework.stereotype.Service;
import org.zerock.mallapi.dto.TodoDTO;

import jakarta.transaction.Transactional;
import lombok.extern.log4j.Log4j2;

@Service
@Transactional
@Log4j2
public class TodoServiceInpl implements TodoService {

    @Override
    public Long register(TodoDTO TodoDTO) {
        return null;
    }

}
