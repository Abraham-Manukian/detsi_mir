import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.detski_mir.data_base.Auth

@Database(entities = [Auth::class], version = 1, exportSchema = false)
abstract class MyAppDatabase : RoomDatabase() {

    abstract fun authDao(): Dao

    companion object {

        @Volatile
        private var INSTANCE: MyAppDatabase? = null

        fun getDb(context: Context): MyAppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MyAppDatabase::class.java,
                    "my_app_database"
                )
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}