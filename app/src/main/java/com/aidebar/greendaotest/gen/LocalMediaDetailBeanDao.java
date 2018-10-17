package com.aidebar.greendaotest.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.china.snapshot.bean.LocalMediaDetailBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "LOCAL_MEDIA_DETAIL_BEAN".
 */
public class LocalMediaDetailBeanDao extends AbstractDao<LocalMediaDetailBean, Long> {

    public static final String TABLENAME = "LOCAL_MEDIA_DETAIL_BEAN";

    /**
     * Properties of entity LocalMediaDetailBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property CreatTimeAsId = new Property(0, long.class, "creatTimeAsId", true, "_id");
        public final static Property LocationDesc = new Property(1, String.class, "locationDesc", false, "LocalMediaDetailBean");
        public final static Property MediaUrl = new Property(2, String.class, "mediaUrl", false, "MEDIA_URL");
        public final static Property ThumbnailUrl = new Property(3, String.class, "thumbnailUrl", false, "THUMBNAIL_URL");
        public final static Property MediaLocalPath = new Property(4, String.class, "mediaLocalPath", false, "MEDIA_LOCAL_PATH");
        public final static Property Likes = new Property(5, int.class, "likes", false, "LIKES");
        public final static Property IsLike = new Property(6, boolean.class, "isLike", false, "IS_LIKE");
    }


    public LocalMediaDetailBeanDao(DaoConfig config) {
        super(config);
    }

    public LocalMediaDetailBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /**
     * Creates the underlying database table.
     */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS " : "";
        db.execSQL("CREATE TABLE " + constraint + "\"LOCAL_MEDIA_DETAIL_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY NOT NULL ," + // 0: creatTimeAsId
                "\"LocalMediaDetailBean\" TEXT," + // 1: locationDesc
                "\"MEDIA_URL\" TEXT," + // 2: mediaUrl
                "\"THUMBNAIL_URL\" TEXT," + // 3: thumbnailUrl
                "\"MEDIA_LOCAL_PATH\" TEXT," + // 4: mediaLocalPath
                "\"LIKES\" INTEGER NOT NULL ," + // 5: likes
                "\"IS_LIKE\" INTEGER NOT NULL );"); // 6: isLike
    }

    /**
     * Drops the underlying database table.
     */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"LOCAL_MEDIA_DETAIL_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, LocalMediaDetailBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getCreatTimeAsId());

        String locationDesc = entity.getLocationDesc();
        if (locationDesc != null) {
            stmt.bindString(2, locationDesc);
        }

        String mediaUrl = entity.getMediaUrl();
        if (mediaUrl != null) {
            stmt.bindString(3, mediaUrl);
        }

        String thumbnailUrl = entity.getThumbnailUrl();
        if (thumbnailUrl != null) {
            stmt.bindString(4, thumbnailUrl);
        }

        String mediaLocalPath = entity.getMediaLocalPath();
        if (mediaLocalPath != null) {
            stmt.bindString(5, mediaLocalPath);
        }
        stmt.bindLong(6, entity.getLikes());
        stmt.bindLong(7, entity.getIsLike() ? 1L : 0L);
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, LocalMediaDetailBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getCreatTimeAsId());

        String locationDesc = entity.getLocationDesc();
        if (locationDesc != null) {
            stmt.bindString(2, locationDesc);
        }

        String mediaUrl = entity.getMediaUrl();
        if (mediaUrl != null) {
            stmt.bindString(3, mediaUrl);
        }

        String thumbnailUrl = entity.getThumbnailUrl();
        if (thumbnailUrl != null) {
            stmt.bindString(4, thumbnailUrl);
        }

        String mediaLocalPath = entity.getMediaLocalPath();
        if (mediaLocalPath != null) {
            stmt.bindString(5, mediaLocalPath);
        }
        stmt.bindLong(6, entity.getLikes());
        stmt.bindLong(7, entity.getIsLike() ? 1L : 0L);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }

    @Override
    public LocalMediaDetailBean readEntity(Cursor cursor, int offset) {
        LocalMediaDetailBean entity = new LocalMediaDetailBean( //
                cursor.getLong(offset + 0), // creatTimeAsId
                cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // locationDesc
                cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // mediaUrl
                cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // thumbnailUrl
                cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // mediaLocalPath
                cursor.getInt(offset + 5), // likes
                cursor.getShort(offset + 6) != 0 // isLike
        );
        return entity;
    }

    @Override
    public void readEntity(Cursor cursor, LocalMediaDetailBean entity, int offset) {
        entity.setCreatTimeAsId(cursor.getLong(offset + 0));
        entity.setLocationDesc(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setMediaUrl(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setThumbnailUrl(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setMediaLocalPath(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setLikes(cursor.getInt(offset + 5));
        entity.setIsLike(cursor.getShort(offset + 6) != 0);
    }

    @Override
    protected final Long updateKeyAfterInsert(LocalMediaDetailBean entity, long rowId) {
        entity.setCreatTimeAsId(rowId);
        return rowId;
    }

    @Override
    public Long getKey(LocalMediaDetailBean entity) {
        if (entity != null) {
            return entity.getCreatTimeAsId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(LocalMediaDetailBean entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }

}
