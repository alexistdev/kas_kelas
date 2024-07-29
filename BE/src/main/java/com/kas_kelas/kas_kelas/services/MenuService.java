package com.kas_kelas.kas_kelas.services;

import com.kas_kelas.kas_kelas.models.entity.Menu;

public interface MenuService {

    public Menu createMenu(Menu menu);

    public Iterable<Menu> getAllMenu();
}
