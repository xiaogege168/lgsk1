package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping
    public ModelAndView index() {
        ModelAndView view = new ModelAndView("index");
        view.addObject("welcome", "hello");
        return view;
    }

}

    $ git config --global user.name "xiaogege168"
        $ git config --global user.email "753516357@qq.com"


        Administrator@MS-20180131BXRT MINGW64 /d/001 (master)
        $ git config --global user.name "xiaogege168"

        Administrator@MS-20180131BXRT MINGW64 /d/001 (master)
        $ git config --global user.email "753516357@qq.com"

        Administrator@MS-20180131BXRT MINGW64 /d/001 (master)
        $ ssh-keygen
        Generating public/private rsa key pair.
        Enter file in which to save the key (/c/Users/Administrator/.ssh/id_rsa):
        Created directory '/c/Users/Administrator/.ssh'.
        Enter passphrase (empty for no passphrase):
        Enter same passphrase again:
        Your identification has been saved in /c/Users/Administrator/.ssh/id_rsa.
        Your public key has been saved in /c/Users/Administrator/.ssh/id_rsa.pub.
        The key fingerprint is:
        SHA256:rGpAPZRiUzN5wlCN6UM4ud6NuXOtzO1KwOHjQ7p7MYw Administrator@MS-20180131BXRT
        The key's randomart image is:
        +---[RSA 3072]----+
        |  .B=*           |7777
        |  B Xoo          |
        | . X.o           |
        |
        | o +**  S        |
        |  E+Bo..         |
        |  ..o+o.         |
        |   .=*...        |0000000000000000000000000000000000
        |  o+.o=+o        |
        +----[SHA256]-----+
        444
        Administrator@MS-20180131BXRT MINGW64 /d/001 (master)
        |  oo=. .