package br.edu.infnet.appanuncio.model.domain;

import br.edu.infnet.appanuncio.model.exceptions.PrecoNegativoException;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "TImovel")
public class Imovel extends Item {

        private String tipoImovel;
        private String cidade;
        private Integer area;

        public String getTipoImovel() {
                return tipoImovel;
        }

        public void setTipoImovel(String tipoImovel) {
                this.tipoImovel = tipoImovel;
        }

        public String getCidade() {
                return cidade;
        }

        public void setCidade(String cidade) {
                this.cidade = cidade;
        }

        public Integer getArea() {
                return area;
        }

        public void setArea(Integer area) {
                this.area = area;
        }

        @Override
        public Double calcularPrecoComJuros() throws PrecoNegativoException {

               if (getPreco() < 0) {
                       throw new PrecoNegativoException("Preço menor que 0");
               }
                return getPreco() * 0.015;
        }

        @Override
        public String toString() {
                return  super.toString() +
                        "Imovel{" +
                        "tipoImovel='" + tipoImovel + '\'' +
                        ", cidade='" + cidade + '\'' +
                        ", area=" + area +
                        '}';
        }

        @Override
        public void impressao(){
                System.out.println("------ Imovel--------");
                System.out.println(this);
        }
}
