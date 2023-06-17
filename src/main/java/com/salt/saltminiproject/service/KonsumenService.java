package com.salt.saltminiproject.service;

import com.salt.saltminiproject.entity.Konsumen;
import com.salt.saltminiproject.repository.KonsumenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KonsumenService {

    private final KonsumenRepository konsumenRepository;

    public List<Konsumen> getAll() {
       return konsumenRepository.findAll();
    }

    public Konsumen addKonsumen(Konsumen konsumen) {
        return konsumenRepository.save(konsumen);
    }


}
