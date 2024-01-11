import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entites.Alunos;

public class App {
    public static void main(String[] args) throws Exception {
       
        //adicionando os alunos em 3 Set divididos por curso
        Scanner s = new Scanner(System.in);
        System.out.println("quantos estudantes no curso A?");
        Set<Alunos> setA = new HashSet<>();
        int aa = s.nextInt();
        for(int i=1; i<=aa; i++){
            setA.add(new Alunos(s.nextInt()));

        }
         System.out.println("quantos estudantes no curso B?");
        Set<Alunos> setB = new HashSet<>();
        int bb = s.nextInt();
        for(int i=1; i<=bb; i++){
            setB.add(new Alunos(s.nextInt()));

        }
         System.out.println("quantos estudantes no curso C?");
        Set<Alunos> setC = new HashSet<>();
        int cc = s.nextInt();
        for(int i=1; i<=cc; i++){ 
            setC.add(new Alunos(s.nextInt()));

        }
        //adicionando todos em apenas um set
        setA.addAll(setB);
        setC.addAll(setA);
        
        //verificando a quantidade de alunos que o professor tem, considerando que o mesmo aluno pode estar em diferentes cursos
        System.out.println("total de estudantes:"+ setC.size());


    }
}
