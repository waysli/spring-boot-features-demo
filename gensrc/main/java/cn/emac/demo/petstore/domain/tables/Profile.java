/*
 * This file is generated by jOOQ.
*/
package cn.emac.demo.petstore.domain.tables;


import cn.emac.demo.petstore.domain.Jpetstore;
import cn.emac.demo.petstore.domain.Keys;
import cn.emac.demo.petstore.domain.tables.records.ProfileRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * Cadastro de Perfis
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Profile extends TableImpl<ProfileRecord> {

    private static final long serialVersionUID = 910251861;

    /**
     * The reference instance of <code>jpetstore.profile</code>
     */
    public static final Profile PROFILE = new Profile();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProfileRecord> getRecordType() {
        return ProfileRecord.class;
    }

    /**
     * The column <code>jpetstore.profile.userid</code>.
     */
    public final TableField<ProfileRecord, String> USERID = createField("userid", org.jooq.impl.SQLDataType.VARCHAR.length(80).nullable(false), this, "");

    /**
     * The column <code>jpetstore.profile.langpref</code>.
     */
    public final TableField<ProfileRecord, String> LANGPREF = createField("langpref", org.jooq.impl.SQLDataType.VARCHAR.length(80).nullable(false), this, "");

    /**
     * The column <code>jpetstore.profile.favcategory</code>.
     */
    public final TableField<ProfileRecord, String> FAVCATEGORY = createField("favcategory", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "");

    /**
     * The column <code>jpetstore.profile.mylistopt</code>.
     */
    public final TableField<ProfileRecord, Byte> MYLISTOPT = createField("mylistopt", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>jpetstore.profile.banneropt</code>.
     */
    public final TableField<ProfileRecord, Byte> BANNEROPT = createField("banneropt", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * Create a <code>jpetstore.profile</code> table reference
     */
    public Profile() {
        this("profile", null);
    }

    /**
     * Create an aliased <code>jpetstore.profile</code> table reference
     */
    public Profile(String alias) {
        this(alias, PROFILE);
    }

    private Profile(String alias, Table<ProfileRecord> aliased) {
        this(alias, aliased, null);
    }

    private Profile(String alias, Table<ProfileRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "Cadastro de Perfis");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Jpetstore.JPETSTORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ProfileRecord> getPrimaryKey() {
        return Keys.KEY_PROFILE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProfileRecord>> getKeys() {
        return Arrays.<UniqueKey<ProfileRecord>>asList(Keys.KEY_PROFILE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Profile as(String alias) {
        return new Profile(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Profile rename(String name) {
        return new Profile(name, null);
    }
}
