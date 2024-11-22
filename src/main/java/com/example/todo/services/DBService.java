package com.example.todo.services;

import com.example.todo.domain.Todo;
import com.example.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private TodoRepository todoRepository;

    public void instanciaBaseDeDados() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot e Angular", sdf.parse("02/11/2024"), false);
        Todo t2 = new Todo(null, "Ler", "Ler livro de desenvolvimento pessoal", sdf.parse("03/11/2024"), true);
        Todo t3 = new Todo(null, "Exercicios", "Praticar exercicios fisicos", sdf.parse("04/11/2024"), false);
        Todo t4 = new Todo(null, "Meditar", "Meditar durante 30 segundos pela manha", sdf.parse("27/03/2024"), true);
        todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));
    }

}
