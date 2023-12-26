package com.example.junk.Service;import com.example.junk.domain.UserDotori;import com.example.junk.repository.CashRepository;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Service;import java.util.List;@Servicepublic class CashService {    private CashRepository cashRepository;    @Autowired    public CashService(CashRepository cashRepository) {        this.cashRepository = cashRepository;    }    public void ChargeCash(UserDotori user) {        cashRepository.save(user);    }    public List<UserDotori> findAll(String userName, Long dotori) {        return cashRepository.findTop5ByUserNameAndDotoriGreaterThanOrderByUserRegDateTimeDesc(userName, dotori);    }    public List<UserDotori> finddotori(){        return cashRepository.findAll();    }}