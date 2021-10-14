package com.fran.APPThree.Service.Implementation;

import com.fran.APPThree.Model.Disco;
import com.fran.APPThree.Repository.DiscoRepository;
import com.fran.APPThree.Service.DiscoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DiscoServiceImplementation implements DiscoService {

    private final DiscoRepository discoRepository;

    @Autowired
    public DiscoServiceImplementation(DiscoRepository discoRepository) {
        this.discoRepository = discoRepository;
    }

    @Override
    public Disco selectDiscoById(int id) {
        return discoRepository.selectDiscoById(id);

    }
}
