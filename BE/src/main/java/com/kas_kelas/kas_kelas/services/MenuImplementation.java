package com.kas_kelas.kas_kelas.services;

import com.kas_kelas.kas_kelas.models.entity.Menu;
import com.kas_kelas.kas_kelas.models.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuImplementation implements MenuService {

    @Autowired
    private MenuRepository menuRepository;

    @Override
    public Menu createMenu(Menu menu) {
        return menuRepository.save(menu);
    }

    @Override
    public Iterable<Menu> getAllMenu() {
        return menuRepository.findAll();
    }
}
