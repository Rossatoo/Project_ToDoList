package com.example.todo.services;

import com.example.todo.domain.Todo;
import com.example.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private TodoRepository todoRepository;

    public void instanciaBaseDeDados() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        Todo t1 = new Todo(null, "Estudar", "Spring Boot e Angular", LocalDateTime.parse("02/11/2024 19:00", formatter), false);
        Todo t2 = new Todo(null, "Ler", "Ler livro de desenvolvimento pessoal", LocalDateTime.parse("03/11/2024 19:50", formatter), true);
        Todo t3 = new Todo(null, "Exercicios", "Praticar exercicios fisicos", LocalDateTime.parse("04/11/2024 22:00", formatter), false);
        Todo t4 = new Todo(null, "Meditar", "Meditar durante 30 segundos pela manha", LocalDateTime.parse("27/03/2024 05:40", formatter), true);
        todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));
    }

}
