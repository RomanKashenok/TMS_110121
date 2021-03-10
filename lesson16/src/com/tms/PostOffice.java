package com.tms;

public class PostOffice {

    private Pen postPen;

    public PostOffice(Pen postPen) {
        this.postPen = postPen;
    }

    public Pen getPostPen() {
        return postPen;
    }

    public void setPostPen(Pen postPen) {
        this.postPen = postPen;
    }
}
