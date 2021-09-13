package br.edu.ifpb.domain.hotel;

import br.edu.ifpb.infra.jpa.LocalDateConverter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 21/04/2021, 09:56:25
 */
@Entity
//@Table(name = "Hospedagemfase2")
@IdClass(ChaveDaHospedagem.class)
public class Hospedagem implements Serializable {

    @Id
    @Column(name = "hotel_id", updatable = false, insertable = false) // read-only
    private int hotelId;
    @Id
    @Column(name = "hospede_id", updatable = false, insertable = false) // read-only
    private int hospedeId;
    //others must be specified read-only
    @ManyToOne
    private Hotel hotel;
    @ManyToOne
    private Hospede hospede;
//    @Temporal(TemporalType.DATE)
    @Convert(converter = LocalDateConverter.class)
    private LocalDate dataInicial;

    public Hospedagem() {
    }
    public Hospedagem(Hotel hotel, Hospede hospede, LocalDate data) {
        this.hotel = hotel;
        this.hospede = hospede;
        this.dataInicial = data;
    }

    public Hotel getHotel() {
        return hotel;
    }
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    public Hospede getHospede() {
        return hospede;
    }
    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }


    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public int getHospedeId() {
        return hospedeId;
    }

    public void setHospedeId(int hospedeId) {
        this.hospedeId = hospedeId;
    }

    @Override
    public String toString() {
        return "Hospedagem{" +
                "hotelId=" + hotelId +
                ", hospedeId=" + hospedeId +
                ", hotel=" + hotel +
                ", hospede=" + hospede +
                ", dataInicial=" + dataInicial +
                '}';
    }
}
