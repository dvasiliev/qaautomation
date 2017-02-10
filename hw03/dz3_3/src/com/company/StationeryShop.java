package com.company;

/**
 * Created by Dima on 08.02.2017.
 */
public class StationeryShop {
    public Stationery [] stationeriy;

    public Stationery[] getStationeriy() {
        return stationeriy;
    }

    public void setStationeriy(Stationery[] stationeriy) {
        this.stationeriy = stationeriy;
    }

    public void addProduct (Stationery st){
        Stationery [] stnew = new Stationery[stationeriy.length+1];
        for (int i = 0; i < stationeriy.length; i++) {
            stnew[i] = stationeriy[i];
        }
        stnew[stationeriy.length] = st;
        setStationeriy(stnew);
    }

    public void addProduct (Stationery [] st){
        Stationery [] stnew = new Stationery[stationeriy.length+st.length];
        for (int i = 0; i < stationeriy.length; i++) {
            stnew[i] = stationeriy[i];
        }
        for (int i = 0; i < st.length; i++) {
            stnew[stationeriy.length+i] = st[i];
        }
        setStationeriy(stnew);
    }

    public int productCount(){
        int count = 0;
        if (stationeriy.length>0) count = stationeriy.length;
        return count;
    }

    public void productPriceSort(){
        for (int i = 0; i < stationeriy.length; i++) {
            for (int j = i; j < stationeriy.length; j++) {
                if (stationeriy[j].getPrice()<stationeriy[i].getPrice()) {
                    Stationery min = stationeriy[i];
                    stationeriy[i] = stationeriy[j];
                    stationeriy[j] = min;
                }
            }
        }
    }

    public void showProducts(){
        for (int i = 0; i < stationeriy.length; i++) {
            System.out.println(stationeriy[i].toString());
        }
    }

}
