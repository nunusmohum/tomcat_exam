package com.ll.exam;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Rq {
    HttpServletRequest req;
    HttpServletResponse resp;

    Rq(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.req = req;
        this.resp = resp;
        init();
    }
    private void init() throws IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=utf-8");
    }

    public int getIntParam(String queryName, int defaultInt){
        return Integer.parseInt(req.getParameter(queryName));
    }

    public void appendBody(String str) throws IOException {
        resp.getWriter().append(str);
    }
}
