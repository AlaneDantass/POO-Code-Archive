import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
    ArrayList<Disciplina> disciplinaList = new ArrayList<>();
    ArrayList<Aluno> estudantes = new ArrayList<>();

    public boolean  salvarDisciplina(Disciplina d){
        if (d != null){
            disciplinaList.add(d);
            return true;
        }else{
            return false;
        }
    }
    /*Salvar*/
    public boolean salvarAluno(Aluno a){
        if(a != null){
            estudantes.add(a);
            return true;
        }else{
            return false;
        }
    }
    /*remover*/
    public void removerDisciplina(Disciplina d){
        if(d != null){
            disciplinaList.remove(d);}
    }

    public void removerAluno(Aluno a){
        if(a != null){
            estudantes.remove(a);}
    }

    /*Listar */
    public ArrayList<Disciplina> listarDisciplinas(){ //uma lista de objetos do tipo Disciplina
        return disciplinaList;
    }

    public ArrayList<Aluno> listarAlunos(){
        return estudantes;
    }

    public void AlunoDisciplina(Aluno a, Disciplina d){
        if(a != null && d !=null){
            System.out.println( d.addAlunoDisc(a));
        }else{
            System.out.println("Infelizmente não foi possível encontrar respostas compatíveis com o que foi digitado!");
        }
    }

    public void AlunoDisciplinaRemover(Aluno a, Disciplina d){
        if(a!= null && d != null){
            System.out.println(d.removerAluno(a));
        }
    }

    public void AlterarAluno(Aluno GuriAtualizado){
        for(Aluno a: listarAlunos())
        if (a.getMatricula()==(GuriAtualizado.getMatricula())){
            a.setNomeEstudante(GuriAtualizado.getNomeEstudante());
            a.setCurso(GuriAtualizado.getCurso());
            a.setEmail(GuriAtualizado.getEmail());
            a.setSerie(GuriAtualizado.getSerie());
            break;

        }
        
    }

    //MENU PRINCIPAL
    public void Menu(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("--------MENU------");
            System.out.println("1 – Cadastrar Estudante");
            System.out.println("2 - Cadastrar Disciplina");
            System.out.println("3 - Inserir estudante na disciplina");
            System.out.println("4 - Revover estudante da disciplina");
            System.out.println("5 – Remover Estudante");
            System.out.println("6 - Remover Disciplina");
            System.out.println("7 – Listar ");
            System.out.println("8 – Sair");
            System.out.println("Escolha uma das opções acima: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    //Cadastrar Aluno
                    System.out.println("Digite o nome do Aluno: ");
                    String nomeAluno = scanner.nextLine();
                    System.err.println("Digite o  MATRÍCULA do aluno:");
                    int matricula = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o nome do curso do Aluno: ");
                    String nomeCurso = scanner.nextLine();
                    System.out.println("Digite a série do Aluno: ");
                    int serie = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o email do aluno: ");
                    String email = scanner.nextLine();

                    Aluno aluno = new Aluno(nomeAluno, matricula,nomeCurso, serie, email);
                    salvarAluno(aluno);
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;
                case 2:
                    //Cadastrar Disciplina
                    System.out.println("Digite o código da disciplina: ");
                    int codDisciplina = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o nome da disciplina: ");
                    String nomeDisciplina = scanner.nextLine();
                    System.out.println("Digite o nome do professor: ");
                    String nomeProfessor = scanner.nextLine();
                    
                    Disciplina disciplina = new Disciplina(codDisciplina, nomeDisciplina, nomeProfessor);
                    salvarDisciplina(disciplina);
                    System.out.println("Disciplina cadastrada com sucesso!");
                    break;

                case 3:
                //Cadastrar aluno na disciplina
                    System.out.println("Digite o nome do Aluno que deseja adicionar: ");
                    String nomeAlunoMatriculado = scanner.nextLine();
                    System.out.println("Digite o nome da disciplina a qual deseja inclui-lo: "); 
                    String nomeDiscAssociada = scanner.nextLine();
                    
                    //Verificar Aluno
                    Aluno alunoEncontrado = null;  //"ainda" não aponta pra nada de objeto
                    for(Aluno a: listarAlunos()){
                        if (a.getNomeEstudante().equals(nomeAlunoMatriculado)){
                            alunoEncontrado = a;
                            break;
                        }
                    }
                    Disciplina disciplinaEncontrada = null;
                    for (Disciplina d: listarDisciplinas()){
                        if (d.getNomeDisciplina().equals(nomeDiscAssociada)){
                            disciplinaEncontrada = d;
                            break;
                        }
                            
                    }

                    if (alunoEncontrado != null && disciplinaEncontrada != null){
                        AlunoDisciplina(alunoEncontrado, disciplinaEncontrada);
                    }else{
                        System.out.println("Infelizmente não conseguimos encontrar nenhum valor associado para a disciplina ou aluno que vc digitou");
                    } break;

                case 4:
                    System.out.println("Digite o nome do Aluno que deseja remover da disciplina: ");
                    String nomeAlunoRemovido = scanner.nextLine();
                    System.out.println("Digite o nome da disciplina a qual deseja removê-lo: "); 
                    String nomeDisciplinaRemover = scanner.nextLine();
                
                    Aluno AlunoEncontradoRemove = null;
                    for (Aluno a: listarAlunos()){
                        if (a.getNomeEstudante().equals(nomeAlunoRemovido)){
                            AlunoEncontradoRemove = a;
                        }
                    }

                    Disciplina disciplinaEncontradaRemove = null;
                    for (Disciplina d: listarDisciplinas()){
                        if (d.getNomeDisciplina().equals(nomeDisciplinaRemover)){
                            disciplinaEncontradaRemove = d;
                            break;
                        }
                    }

                    if (AlunoEncontradoRemove != null && disciplinaEncontradaRemove != null){
                        AlunoDisciplinaRemover(AlunoEncontradoRemove, disciplinaEncontradaRemove);
                    }else{
                        System.out.println("Infelizmente não conseguimos encontrar nenhum valor associado para a disciplina ou aluno que vc digitou");
                    } break;

                case 5: 
                System.out.println("Digite o nome do Aluno que deseja remover");
                String alunoDeletar = scanner.nextLine();

                Aluno alunoVerificado= null;  //"ainda" não aponta pra nada de objeto
                for(Aluno a: listarAlunos()){
                    if (a.getNomeEstudante().equals(alunoDeletar)){
                        alunoVerificado = a;
                        break;
                    }
                }
                if (alunoVerificado!= null ){
                    removerAluno(alunoVerificado);
                }else{
                    System.out.println("Infelizmente não conseguimos encontrar nenhum valor associado ao aluno que vc digitou");
                } break;

                case 6: 
                System.out.println("Digite o nome da disciplina que deseja remover ");
                String DisciplinaDeletar = scanner.nextLine();

                Disciplina disciplinaVerificada= null;  //"ainda" não aponta pra nada de objeto
                for(Disciplina d: listarDisciplinas()){
                    if (d.getNomeDisciplina().equals(DisciplinaDeletar)){
                        disciplinaVerificada = d;
                        break;
                    }
                }

                if (disciplinaVerificada!= null ){
                    removerDisciplina(disciplinaVerificada);
                }else{
                    System.out.println("Infelizmente não conseguimos encontrar nenhum valor associado à disciplina que vc digitou");
                } break;
                    
                case 7: 
                    for (Disciplina d: listarDisciplinas()){
                        System.out.println("Disciplina: " + d.getNomeDisciplina());
                        System.out.println("Professor: " + d.getNomeProfessor());
                        System.out.println("Estudantes matriculados:");
                        for(Aluno a: d.getAlunos()){
                            System.out.println("  - " + a.getNomeEstudante());
                        }
                        System.out.println("------------------------------");
                    } 
                    System.out.println("------Todos Estudantes-----");
                    for (Aluno a: listarAlunos()){
                        System.out.println("Aluno: "+ a.getNomeEstudante());
                        System.out.println("Matrícula: "+ a.getMatricula());
                    }
                    break;
                case 8:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
}