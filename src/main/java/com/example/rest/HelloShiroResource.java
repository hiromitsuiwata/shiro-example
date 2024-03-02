package com.example.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresUser;

@Path("/shiro")
public class HelloShiroResource {
    @GET
    @RequiresUser
    public String sayHelloShiro() {
        return "Hello!";
    }

    @GET
    @Path("define")
    @RequiresPermissions("hello:define")
    public String defineShiro() {
        return "Shiro is the Japanese term for a castle";
    }
}
