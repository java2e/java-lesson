package org.banka.service;

public interface IService<T> {

    public void ekle(T t);

    public void sil(T t);

    public T [] listeGetir();
}
