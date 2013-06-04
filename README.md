![GWLPR Logo](http://img851.imageshack.us/img851/7279/logo4jb.png)

## Overview
    Project:       GWLP:R
    Info:          It's a set of game-apps for Reality:Shard that emulates a GW (1) server.
    Languages:     Java
    People:        _rusty, ACB, miracle444, JC123

**Current work**

This project is very slow in development, so dont expect a fully working game server in the near future.
As for the current development, we are basically designing the software like a sandbox that can be extended by
other developers. If you want to contribute to this project, you can either join the development team, or add
pull requests, according to this guide: [The diaspora git-flow guide](https://github.com/diaspora/diaspora/wiki/Git-Workflow)
Yes, this guide was made for the diaspora project, but it covers the basics quite well.


**How to talk to us**

 - Join the dev chat at irc://irc.rizon.net/gwlpr (if your using an IRC client, try joining #gwlpr on the server irc.rizon.net)
 - Leave message in the forums on [GameRevision](http://www.gamerevision.com/forumdisplay.php?61-GWLP-R)

### Install notes for users (you still have to compile it :P):

 - Make sure you have Maven 3+, JDK 7+ and MySQL 5.5+ installed and configured
 - Run `git clone git://github.com/GameRevision/GWLP-R.git` anywhere you like on your system
 - Edit the install script from within the project you just cloned to match your MySQL settings (username, password and database)
 - Run the script with `./install.sh`
 - The script recommends executing a certain command to fill the database - do that
 - Edit DevelopmentEnvironment.java in the "host" project to match your MySQL settings AND to change the IP of your Game Server (search for "MapShard" and you'll find an IP there that you can change).
 - Run `mvn clean package exec:java` from inside the "host" directory
 - Open your GW client and connect using email: "root@gwlp.ps" / password: "root" / character: "Test Char"

### Install notes for developers:
 - _Have a look at the existing guide here:_  [The Developer's Guide](https://github.com/GameRevision/GWLP-R/wiki/Dev-HowTo)

### Links:
 - [Reality:Shard](https://github.com/RealityShard/RealityShard)
