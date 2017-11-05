package com.superbrain.webservices.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author haing
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Description.findAll", query = "SELECT d FROM Description d")
    , @NamedQuery(name = "Description.findById", query = "SELECT d FROM Description d WHERE d.descriptionPK.id = :id")
    , @NamedQuery(name = "Description.findByKey", query = "SELECT d FROM Description d WHERE d.key = :key")
    , @NamedQuery(name = "Description.findByValue", query = "SELECT d FROM Description d WHERE d.value = :value")
    , @NamedQuery(name = "Description.findByCreateTime", query = "SELECT d FROM Description d WHERE d.createTime = :createTime")
    , @NamedQuery(name = "Description.findByUpdateTime", query = "SELECT d FROM Description d WHERE d.updateTime = :updateTime")
    , @NamedQuery(name = "Description.findByQuoteId", query = "SELECT d FROM Description d WHERE d.descriptionPK.quoteId = :quoteId")})
public class Description implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DescriptionPK descriptionPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    private String key;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String value;
    @Column(name = "create_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Column(name = "update_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;
    @JoinColumn(name = "quote_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Quote quote;

    public Description() {
    }

    public Description(DescriptionPK descriptionPK) {
        this.descriptionPK = descriptionPK;
    }

    public Description(DescriptionPK descriptionPK, String key, String value) {
        this.descriptionPK = descriptionPK;
        this.key = key;
        this.value = value;
    }

    public Description(int id, int quoteId) {
        this.descriptionPK = new DescriptionPK(id, quoteId);
    }

    public DescriptionPK getDescriptionPK() {
        return descriptionPK;
    }

    public void setDescriptionPK(DescriptionPK descriptionPK) {
        this.descriptionPK = descriptionPK;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Quote getQuote() {
        return quote;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (descriptionPK != null ? descriptionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Description)) {
            return false;
        }
        Description other = (Description) object;
        if ((this.descriptionPK == null && other.descriptionPK != null) || (this.descriptionPK != null && !this.descriptionPK.equals(other.descriptionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.superbrain.webservices.models.Description[ descriptionPK=" + descriptionPK + " ]";
    }
    
}
