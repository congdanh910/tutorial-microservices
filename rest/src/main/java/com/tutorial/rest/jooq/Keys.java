/*
 * This file is generated by jOOQ.
*/
package com.tutorial.rest.jooq;


import com.tutorial.rest.jooq.tables.Roles;
import com.tutorial.rest.jooq.tables.SchemaVersion;
import com.tutorial.rest.jooq.tables.Users;
import com.tutorial.rest.jooq.tables.records.RolesRecord;
import com.tutorial.rest.jooq.tables.records.SchemaVersionRecord;
import com.tutorial.rest.jooq.tables.records.UsersRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>public</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<RolesRecord, Long> IDENTITY_ROLES = Identities0.IDENTITY_ROLES;
    public static final Identity<UsersRecord, Long> IDENTITY_USERS = Identities0.IDENTITY_USERS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<RolesRecord> ROLES_PKEY = UniqueKeys0.ROLES_PKEY;
    public static final UniqueKey<SchemaVersionRecord> SCHEMA_VERSION_PK = UniqueKeys0.SCHEMA_VERSION_PK;
    public static final UniqueKey<UsersRecord> USERS_PKEY = UniqueKeys0.USERS_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<RolesRecord, Long> IDENTITY_ROLES = createIdentity(Roles.ROLES, Roles.ROLES.ROLE_ID);
        public static Identity<UsersRecord, Long> IDENTITY_USERS = createIdentity(Users.USERS, Users.USERS.USER_ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<RolesRecord> ROLES_PKEY = createUniqueKey(Roles.ROLES, "roles_pkey", Roles.ROLES.ROLE_ID, Roles.ROLES.USER_ID);
        public static final UniqueKey<SchemaVersionRecord> SCHEMA_VERSION_PK = createUniqueKey(SchemaVersion.SCHEMA_VERSION, "schema_version_pk", SchemaVersion.SCHEMA_VERSION.INSTALLED_RANK);
        public static final UniqueKey<UsersRecord> USERS_PKEY = createUniqueKey(Users.USERS, "users_pkey", Users.USERS.USER_ID);
    }
}