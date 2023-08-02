package com.example.rental2.form.inventory;

import java.util.List;

import com.example.rental2.bean.InventorySelectBean;
import com.example.rental2.entity.inventory.BigGenreEntity;
import com.example.rental2.entity.inventory.SmallGenreEntity;
import com.example.rental2.entity.inventory.StatusEntity;

//在庫一覧用Form
public class InventorySelectForm {
    


    private String titleName;

    private Integer bigGenreId;

    private Integer smallGenreId;

    private Integer turns;

    private Integer statusId;

    private List<InventorySelectBean> inventoryList;

    private List<SmallGenreEntity> smallGenreList;

    private List<BigGenreEntity> bigGenreList;
    
    private List<StatusEntity> statusList;


    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }


    public Integer getTurns() {
        return turns;
    }

    public void setTurns(Integer turns) {
        this.turns = turns;
    }

    



    public Integer getBigGenreId() {
        return bigGenreId;
    }

    public void setBigGenreId(Integer bigGenreId) {
        this.bigGenreId = bigGenreId;
    }

    public Integer getSmallGenreId() {
        return smallGenreId;
    }

    public void setSmallGenreId(Integer smallGenreId) {
        this.smallGenreId = smallGenreId;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public List<SmallGenreEntity> getSmallGenreList() {
        return smallGenreList;
    }

    public void setSmallGenreList(List<SmallGenreEntity> smallGenreList) {
        this.smallGenreList = smallGenreList;
    }

    public List<BigGenreEntity> getBigGenreList() {
        return bigGenreList;
    }

    public void setBigGenreList(List<BigGenreEntity> bigGenreList) {
        this.bigGenreList = bigGenreList;
    }

    public List<InventorySelectBean> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(List<InventorySelectBean> inventoryList) {
        this.inventoryList = inventoryList;
    }

    public List<StatusEntity> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<StatusEntity> statusList) {
        this.statusList = statusList;
    }


    
}
