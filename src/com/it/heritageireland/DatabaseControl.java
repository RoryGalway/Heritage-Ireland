package com.it.heritageireland;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

public class DatabaseControl {

//	//colum names for the inventory table
//	private static final String KEY_ROWID = "_id";
//	private static final String KEY_ITEMTYPE = "itemType";
//	private static final String KEY_QUANTITY = "quantity";
//	
//	//table name
//	private static final String DATABASE_TABLE = "inventory";
//	
//	private Context context;
//	private SQLiteDatabase database;
//	private DatabaseHelper dbHelper;
//	
//	public DatabaseControl(Context context){
//		this.context = context;
//		
//	}
//	
//	public DatabaseControl open() throws SQLiteException{
//		dbHelper = new DatabaseHelper(context);
//		database = dbHelper.getWritableDatabase();
//		return this;
//		
//	}
//	
//	public void close(){
//		
//		dbHelper.close();
//	}
//	
//	public long addItem(String type, int quantity){
//		ContentValues setUpVals = createContentValues(type,quantity );
//		
//		return database.insert(DATABASE_TABLE, null, setUpVals);
//	}
//	
//	public boolean updateItem(long id, String type, int quantity){
//		ContentValues updateVals = createContentValues(type,quantity );
//		
//		return database.update(DATABASE_TABLE, updateVals, KEY_ROWID + "=" + id, null) > 0;
//	}
//	public long fetchItemIdByType(String type){
//		Cursor dbcursor;
//		long id = 0;
//		try {
//			dbcursor = database.query(true, DATABASE_TABLE,
//					new String[] { KEY_ROWID }, KEY_ITEMTYPE + "= '" + type
//							+ "'", null, null, null, null, null);
//			dbcursor.moveToFirst();
//			id = dbcursor.getLong(dbcursor.getColumnIndex(KEY_ROWID));
//		} catch (SQLiteException e) {
//			id = -1;
//		}
//		return id;
//	
//	}
//	
//	public String fetchAllItems(){
//		String allData = "";
//		Cursor dbCursor;
//		try {
//			dbCursor = database.query(DATABASE_TABLE, new String[] { KEY_ROWID,
//					KEY_ITEMTYPE, KEY_QUANTITY }, null, null, null, null, null,
//					null);
//			int iRow = dbCursor.getColumnIndex(KEY_ROWID);
//			int iType = dbCursor.getColumnIndex(KEY_ITEMTYPE);
//			int iQuantity = dbCursor.getColumnIndex(KEY_QUANTITY);
//			for (dbCursor.moveToFirst(); !dbCursor.isAfterLast(); dbCursor
//					.moveToLast()) {
//				allData = allData + " " + dbCursor.getString(iRow) + "\t"
//						+ dbCursor.getString(iType) + "\t\t\t"
//						+ dbCursor.getString(iQuantity) + "\n";
//
//			}
//		} catch (Exception e) {
//			allData = "";
//		}
//		return allData;
//	}
//	
//	public boolean deleteItem(long id){
//		
//		return database.delete(DATABASE_TABLE, KEY_ROWID + "=" + id, null) >0;
//		
//	}
//	
//	public ContentValues createContentValues(String type, int quantity){
//		
//		ContentValues values = new ContentValues();
//		values.put(KEY_ITEMTYPE, type);
//		values.put(KEY_QUANTITY, quantity);
//		return values;
//		
//	}
	
}
