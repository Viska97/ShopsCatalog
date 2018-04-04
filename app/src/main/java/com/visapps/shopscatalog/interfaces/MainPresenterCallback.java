package com.visapps.shopscatalog.interfaces;




import com.visapps.shopscatalog.models.Shop;

import java.util.List;

public interface MainPresenterCallback {
    void onLoadShops(List<Shop> shops, int resultscount);
    void onAddShops(List<Shop> shops);
    void onError(String message);
}
