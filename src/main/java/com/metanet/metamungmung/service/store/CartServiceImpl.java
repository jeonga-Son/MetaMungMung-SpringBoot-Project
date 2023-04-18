package com.metanet.metamungmung.service.store;


import com.metanet.metamungmung.dto.store.CartDTO;
import com.metanet.metamungmung.dto.store.CartProductDTO;
import com.metanet.metamungmung.mapper.store.CartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService{
    @Autowired
    private final CartMapper mapper;
    public CartServiceImpl(CartMapper mapper) {
        this.mapper = mapper;
    }


    // 해당 회원 장바구니 리스트 출력
    @Override
    public List<CartDTO> getMyCartList(Long memberIdx) {
        System.out.println( "KANG!!!"+ mapper.getMyCartList(1L));
        return mapper.getMyCartList(memberIdx);
    }

    // 해당 회원 장바구니 추가
    @Override
    public void addCart(CartDTO cart) {
        mapper.addCart(cart);
    }

}