package co.develhope.Deploy2.services;

import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author Tania Ielpo
 */
@Service

public class SumService {

    public int sum(){
        Random random=new Random();
        return random.nextInt()+random.nextInt();
    }
}
