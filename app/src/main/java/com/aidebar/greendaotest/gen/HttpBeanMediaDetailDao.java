package com.aidebar.greendaotest.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.china.snapshot.bean.HttpBeanMediaDetail;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "HTTP_BEAN_MEDIA_DETAIL".
 */
public class HttpBeanMediaDetailDao extends AbstractDao<HttpBeanMediaDetail, Long> {

    public static final String TABLENAME = "HTTP_BEAN_MEDIA_DETAIL";

    /**
     * Properties of entity HttpBeanMediaDetail.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property CreatTimeAsId = new Property(0, long.class, "creatTimeAsId", true, "_id");
        public final static Property LocationDesc = new Property(1, String.class, "locationDesc", false, "HttpBeanMediaDetail");
        public final static Property MediaUrl = new Property(2, String.class, "mediaUrl", false, "MEDIA_URL");
        public final static Property ThumbnailUrl = new Property(3, String.class, "thumbnailUrl", false, "THUMBNAIL_URL");
        public final static Property UploadUserName = new Property(4, String.class, "uploadUserName", false, "UPLOAD_USER_NAME");
        public final static Property Likes = new Property(5, int.class, "likes", false, "LIKES");
        public final static Property IsLike = new Property(6, boolean.class, "isLike", false, "IS_LIKE");
    }


    public HttpBeanMediaDetailDao(DaoConfig config) {
        super(config);
    }

    public HttpBeanMediaDetailDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /**
     * Creates the underlying database table.
     */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS " : "";
        db.execSQL("CREATE TABLE " + constraint + "\"HTTP_BEAN_MEDIA_DETAIL\" (" + //
                "\"_id\" INTEGER PRIMARY KEY NOT NULL ," + // 0: creatTimeAsId
                "\"HttpBeanMediaDetail\" TEXT," + // 1: locationDesc
                "\"MEDIA_URL\" TEXT," + // 2: mediaUrl
                "\"THUMBNAIL_URL\" TEXT," + // 3: thumbnailUrl
                "\"UPLOAD_USER_NAME\" TEXT," + // 4: uploadUserName
                "\"LIKES\" INTEGER NOT NULL ," + // 5: likes
                "\"IS_LIKE\" INTEGER NOT NULL );"); // 6: isLike
    }

    /**
     * Drops the underlying database table.
     */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"HTTP_BEAN_MEDIA_DETAIL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, HttpBeanMediaDetail entity) {
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

        String uploadUserName = entity.getUploadUserName();
        if (uploadUserName != null) {
            stmt.bindString(5, uploadUserName);
        }
        stmt.bindLong(6, entity.getLikes());
        stmt.bindLong(7, entity.getIsLike() ? 1L : 0L);
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, HttpBeanMediaDetail entity) {
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

        String uploadUserName = entity.getUploadUserName();
        if (uploadUserName != null) {
            stmt.bindString(5, uploadUserName);
        }
        stmt.bindLong(6, entity.getLikes());
        stmt.bindLong(7, entity.getIsLike() ? 1L : 0L);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }

    @Override
    public HttpBeanMediaDetail readEntity(Cursor cursor, int offset) {
        HttpBeanMediaDetail entity = new HttpBeanMediaDetail( //
                cursor.getLong(offset + 0), // creatTimeAsId
                cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // locationDesc
                cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // mediaUrl
                cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // thumbnailUrl
                cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // uploadUserName
                cursor.getInt(offset + 5), // likes
                cursor.getShort(offset + 6) != 0 // isLike
        );
        return entity;
    }

    @Override
    public void readEntity(Cursor cursor, HttpBeanMediaDetail entity, int offset) {
        entity.setCreatTimeAsId(cursor.getLong(offset + 0));
        entity.setLocationDesc(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setMediaUrl(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setThumbnailUrl(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setUploadUserName(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setLikes(cursor.getInt(offset + 5));
        entity.setIsLike(cursor.getShort(offset + 6) != 0);
    }

    @Override
    protected final Long updateKeyAfterInsert(HttpBeanMediaDetail entity, long rowId) {
        entity.setCreatTimeAsId(rowId);
        return rowId;
    }

    @Override
    public Long getKey(HttpBeanMediaDetail entity) {
        if (entity != null) {
            return entity.getCreatTimeAsId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(HttpBeanMediaDetail entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }

}
