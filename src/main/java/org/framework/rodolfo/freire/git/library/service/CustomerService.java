package org.framework.rodolfo.freire.git.library.service;

import org.framework.rodolfo.freire.git.library.component.SearchAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    SearchAddress search;

    public String findAddress(){
        return search.findAddressByPostalCode();
    }

}
