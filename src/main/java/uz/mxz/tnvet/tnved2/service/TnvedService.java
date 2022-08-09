package uz.mxz.tnvet.tnved2.service;

import org.springframework.stereotype.Service;
import uz.mxz.tnvet.tnved2.entity.Tnved;
import uz.mxz.tnvet.tnved2.repository.TnvedRepository;

import java.util.List;

@Service
public class TnvedService {

    private static TnvedRepository tnvedRepository = null;

    public TnvedService(TnvedRepository tnvedRepository) {
        this.tnvedRepository = tnvedRepository;
    }

    public static List<Tnved> findAlls(){
        return tnvedRepository.findAll();
    }

}
