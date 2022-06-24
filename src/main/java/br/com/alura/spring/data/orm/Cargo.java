package br.com.alura.spring.data.orm;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cargos")
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;

    @OneToMany(mappedBy = "cargo",fetch = FetchType.LAZY)
    private List<Funcionario> funcionarios;

    public Cargo(Long id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }

    public Cargo() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "" + this.descricao;
    }
}
