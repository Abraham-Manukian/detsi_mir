import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.detski_mir.data_base.Auth

@Database(entities = [Auth::class], version = 1)
abstract class MyAppDatabase : RoomDatabase() {

    abstract fun authDao(): Dao

    companion object {
        @Volatile
        private var INSTANCE: MyAppDatabase? = null

        fun getDb(context: Context): MyAppDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MyAppDatabase::class.java,
                    "my-db"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}