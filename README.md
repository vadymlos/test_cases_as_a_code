## 1. Creating a project for writing test cases as code

#### 1.1. Install Java 17 on windows
Step 1 - Download JDK 17


Step 2 - Install JDK

## 2. Install intellij idea
IntelliJ IDEA is a cross-platform IDE that provides consistent experience on the Windows, macOS, and Linux operating systems.

IntelliJ IDEA is available in the following editions:

Community Edition is free and open-source, licensed under Apache 2.0. It provides all the basic features for JVM and Android development.

IntelliJ IDEA Ultimate is commercial, distributed with a 30-day trial period. It provides additional tools and features for web and enterprise development.

#### 2.1 Standalone installation

Install IntelliJ IDEA manually to manage the location of every instance and all the configuration files. For example, if you have a policy that requires specific install locations.

![image Arch-Test](./assets/images/install_idea_windows.png)

![image Arch-Test](./assets/images/install_idea_macOs.png)

![image Arch-Test](./assets/images/install_idea_linux.png)

To create a desktop entry, do one of the following:

 - On the Welcome screen, click Configure | Create Desktop Entry

 - From the main menu, click Tools | Create Desktop Entry

When you run IntelliJ IDEA for the first time, you can take several steps to complete the installation, customize your instance, and start working with the IDE.

For more information, see Run IntelliJ IDEA for the first time.

For information about the location of the default IDE directories with user-specific files, see Directories used by the IDE.

#### 2.2 Silent installation on Windows

Silent installation is performed without any user interface. It can be used by network administrators to install IntelliJ IDEA on a number of machines and avoid interrupting other users.

To perform silent install, run the installer with the following switches:

 - /S: Enable silent install

 - /CONFIG: Specify the path to the silent configuration file

 - /D: Specify the path to the installation directory

This parameter must be the last in the command line and it should not contain any quotes even if the path contains blank spaces.

For example: ideaIU.exe /S /CONFIG=d:\temp\silent.config /D=d:\IDE\IntelliJ IDEA Ultimate

To check for issues during the installation process, add the /LOG switch with the log file path and name between the /S and /D parameters. The installer will generate the specified log file. 

For example: ideaIU.exe /S /CONFIG=d:\temp\silent.config /LOG=d:\JetBrains\IDEA\install.log /D=d:\IDE\IntelliJ IDEA Ultimate

#### 2.3 Install as a snap package on Linux

You can install IntelliJ IDEA as a self-contained snap package. Since snaps update automatically, your IntelliJ IDEA installation will always be up to date.

![image Arch-Test](./assets/images/install_idea_as_snap_package.png)

## 3. Registration on github and connect with project



