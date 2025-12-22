package dev.codewithdaiana.CadastroDeNinjas.Missoes;

import dev.codewithdaiana.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    // @OneToMany - Uma missão pode ter vários ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

}
