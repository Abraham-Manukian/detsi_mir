import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.detski_mir.sampledata.auth
import com.example.detski_mir.sampledata.clients
import com.example.detski_mir.sampledata.goods
import com.example.detski_mir.sampledata.level

@Database(entities = arrayOf(auth::class, clients::class, goods::class, level::class), version = 1)
abstract class MyAppDatabase() : RoomDatabase() {
    abstract fun clientsDao(): clientsDao
    abstract fun goodsDao(): goodsDao
    abstract fun authDao(): authDao
    abstract fun levelDao(): levelDao

    companion object {
        @Volatile
        private var INSTANCE: MyAppDatabase? = null

        fun getDatabase(context: Context): MyAppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MyAppDatabase::class.java,
                    "my_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}