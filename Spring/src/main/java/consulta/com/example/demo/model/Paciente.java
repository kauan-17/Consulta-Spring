package consulta.com.example.demo.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "paciente")
public
class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;
    private String nome;
    private String usuario;
    private String senha;


    
    public String getCpf() {
        return cpf;
    }



    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }



    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getUsuario() {
        return usuario;
    }



    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }



    public String getSenha() {
        return senha;
    }



    public void setSenha(String senha) {
        this.senha = senha;
    }



    @OneToMany(mappedBy = "paciente")
    private List<Consulta> consultas;
}
