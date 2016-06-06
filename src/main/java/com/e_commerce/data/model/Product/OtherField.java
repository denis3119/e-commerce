package com.e_commerce.data.model.Product;

import com.e_commerce.data.model.common.AbstractEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;

/**
 * Created by admin on 31.05.2016.
 */
@Entity
@NoArgsConstructor
@Getter
@Setter
public class OtherField extends AbstractEntity {
    @Length(max = 3000)
    private String stringValue;
    @Length(max = 50)
    private String name;
    private long longValue;
    private boolean boolValue;
}
