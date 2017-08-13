package com.yun.opern.model.opern;

public class GetPopularOpernInfoRequest {
    private int index = 0;
    private int numPerPage = 30;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getNumPerPage() {
        return numPerPage;
    }

    public void setNumPerPage(int numPerPage) {
        this.numPerPage = numPerPage;
    }
}
