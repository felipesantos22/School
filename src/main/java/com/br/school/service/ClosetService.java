package com.br.school.service;

import com.br.school.entity.Closet;
import com.br.school.repository.ClosetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClosetService {
    private final ClosetRepository closetRepository;

    public ClosetService(ClosetRepository closetRepository) {
        this.closetRepository = closetRepository;
    }

    public Closet createService(Closet closet) {
        return closetRepository.save(closet);
    }

    public List<Closet> readService() {
        return closetRepository.findAll();
    }


}
