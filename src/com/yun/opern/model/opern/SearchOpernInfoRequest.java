package com.yun.opern.model.opern;

public class SearchOpernInfoRequest {
    private String searchParameter = "";
    private int index = 0;
    private int numPerPage = 30;

    public String getSearchParameter() {
        return searchParameter;
    }

    public void setSearchParameter(String searchParameter) {
        this.searchParameter = searchParameter;
    }

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

    @Override
    public String toString() {
        return "SearchOpernInfoRequest{" +
                "searchParameter='" + searchParameter + '\'' +
                ", index=" + index +
                ", numPerPage=" + numPerPage +
                '}';
    }
}
