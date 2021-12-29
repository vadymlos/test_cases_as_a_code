## 1. Creating a project for writing test cases as code

### 1.1. Install Java 17 on windows
Step 1 - Download JDK 17


Step 2 - Install JDK

## 2. Install intellij idea
IntelliJ IDEA is a cross-platform IDE that provides consistent experience on the Windows, macOS, and Linux operating systems.

IntelliJ IDEA is available in the following editions:

Community Edition is free and open-source, licensed under Apache 2.0. It provides all the basic features for JVM and Android development.

IntelliJ IDEA Ultimate is commercial, distributed with a 30-day trial period. It provides additional tools and features for web and enterprise development.

### 2.1 Standalone installation

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

### 2.2 Silent installation on Windows

Silent installation is performed without any user interface. It can be used by network administrators to install IntelliJ IDEA on a number of machines and avoid interrupting other users.

To perform silent install, run the installer with the following switches:

 - /S: Enable silent install

 - /CONFIG: Specify the path to the silent configuration file

 - /D: Specify the path to the installation directory

This parameter must be the last in the command line and it should not contain any quotes even if the path contains blank spaces.

For example: `ideaIU.exe /S /CONFIG=d:\temp\silent.config /D=d:\IDE\IntelliJ IDEA Ultimate`

To check for issues during the installation process, add the /LOG switch with the log file path and name between the /S and /D parameters. The installer will generate the specified log file. 

For example: `ideaIU.exe /S /CONFIG=d:\temp\silent.config /LOG=d:\JetBrains\IDEA\install.log /D=d:\IDE\IntelliJ IDEA Ultimate`

### 2.3 Install as a snap package on Linux

You can install IntelliJ IDEA as a self-contained snap package. Since snaps update automatically, your IntelliJ IDEA installation will always be up to date.

![image Arch-Test](./assets/images/install_idea_as_snap_package.png)

## 3. Registration on github and connect with project

### 3.1 Setting up Git

1. Download and install the latest version of Git.
2. Set your username in Git.
3. Set your commit email address in Git.

### 3.2 Next steps: Authenticating with GitHub from Git

When you connect to a GitHub repository from Git, you'll need to authenticate with GitHub using either HTTPS or SSH.

`Note: You can authenticate to GitHub using GitHub CLI, for either HTTP or SSH. For more information, see gh auth login.`

#### 3.2.2 Connecting over HTTPS (recommended)
If you clone with HTTPS, you can cache your GitHub credentials in Git using a credential helper.

#### 3.2.3 Connecting over SSH
If you clone with SSH, you must generate SSH keys on each computer you use to push or pull from GitHub.

### 3.3 Create a repository
1. In the upper-right corner of any page, use the  drop-down menu, and select New repository.
![image Arch-Test](./assets/images/new_repo.png)

2. Type a short, memorable name for your repository. For example, "hello-world".
![image Arch-Test](./assets/images/repo_name.png)

3. Optionally, add a description of your repository. For example, "My first repository on GitHub."
![image Arch-Test](./assets/images/repo_description.png)

4. Choose a repository visibility.
![image Arch-Test](./assets/images/repo_visibility.png)

5. Select Initialize this repository with a README.
![image Arch-Test](./assets/images/readme.png)

6. Click Create repository.
![image Arch-Test](./assets/images/create_repo_button.png)

### 3.4 Integration with Github
![image Arch-Test](./assets/images/connection_repo.png)

## 4. Create project in idea
1. Create project.

![image Arch-Test](./assets/images/create_idea_project.png)
2. Choose maven, java version 17 and click next.

![image Arch-Test](./assets/images/maven_proj.png)
3. Enter name of the project and click button 'Finish'.

![image Arch-Test](./assets/images/finish_project.png)

## 5. Structure of project

`Folder "src" -> "test" -> "java" -> "Test"` - for creating new tests and annotations.

`File .gitignore` - for adding untracked files. 

`File pom.xml` - for adding dependencies.

`File README.md` - description of creating and using of the project.

## 6. Customization allure testOps
### 6.1 Install plugin Allure TestOps
File -> Setting...

Choose allure TestOps Support
![image Arch-Test](./assets/images/allure_testops.png)
### 6.2 Plug-in connection settings

Plug-in connection settings

    Go to Tools -> Allure -> Authorize
  - Provide Allure TestOps URL
  - Provide personal access token
  - Click OK

![image Arch-Test](./assets/images/plug_in_allure.png)

If there is no error message, then authentication is completed and you can start using the integration.

![image Arch-Test](./assets/images/auth_allure_testops.png)

### 6.3 Upload test results to Allure TestOps from IntelliJ IDEA
1. Run tests on your development environment, i.e. on your local machine.
2. Select folder with allure results in the project tree and then right click the folder.
3. In the context menu select Upload Results to Allure
![image Arch-Test](./assets/images/allure_results.png)
4. Select a Project to sent the test results and name your launch
![image Arch-Test](./assets/images/upload_result_to_allure.png)
5. The results will be available in the Allure TestOps in section Launches of the project selected in step 4.
![image Arch-Test](./assets/images/allure_run.png)





