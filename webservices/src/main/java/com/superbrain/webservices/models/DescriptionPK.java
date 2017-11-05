package com.superbrain.webservices.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author haing
 */
@Embeddable
public class DescriptionPK implements Serializable {

    @Basic(optional = false)
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quote_id")
    private int quoteId;

    public DescriptionPK() {
    }

    public DescriptionPK(int id, int quoteId) {
        this.id = id;
        this.quoteId = quoteId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(int quoteId) {
        this.quoteId = quoteId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) quoteId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DescriptionPK)) {
            return false;
        }
        DescriptionPK other = (DescriptionPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.quoteId != other.quoteId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.superbrain.webservices.models.DescriptionPK[ id=" + id + ", quoteId=" + quoteId + " ]";
    }
    
}
