/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exerciciosmaven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
import org.kohsuke.github.GHCreateRepositoryBuilder;
import org.kohsuke.github.GitHub;

/**
 *
 * @author femio23
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static GitHub gh1;
    static Scanner sc=null;
    static File fich=null;
    public static void main(String[] args) throws IOException {
       
//        try{
//            fich=new File("user.txt");
//            sc=new Scanner(fich);
//            
//            gh1=GitHub.connectUsingPassword(sc.nextLine(),sc.nextLine());
//            novorep("Primeiro repo Maven");
//            
//        }catch(FileNotFoundException fnfe1){
//            System.out.println("error;"+fnfe1.getMessage());
//        }
//        sc.close();
//    try{
//        Git.cloneRepository()
//            .setURI("https://github.com/FranRM/Boletin21.git")
//            .setDirectory(new File("nueva"))
//            .call();
//    }catch(GitAPIException ex1){
//        System.out.println("Error:"+ex1.getMessage());
//    }
    FileRepositoryBuilder repositorear = new FileRepositoryBuilder();
Repository repository = repositorear.setGitDir(new File("C:\\Users\\Femio\\Documents\\NetBeansProjects\\CodigoMaquinaCOD\\ExerciciosMaven\\nueva\\.git"))
                .readEnvironment() // scan environment GIT_* variables
                .findGitDir() // scan up the file system tree
                .setMustExist(true)
                .build();
    
    System.out.println("HolaMundo");
    }
    public static void novorep(String repoNombre) throws IOException {
        GHCreateRepositoryBuilder repo = gh1.createRepository(repoNombre);
        repo.autoInit(true)
            .create();
        System.out.println("Listo");
    }
    
}
