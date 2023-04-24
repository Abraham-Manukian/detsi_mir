
import androidx.room.*
import com.example.detski_mir.data_base.goods
import androidx.room.Dao

@Dao
interface goodsDao {
    @Query("SELECT * FROM goods")
    fun getAll(): List<goods>

    /*@Query("SELECT * FROM goods WHERE Id = :index")
    fun getByIndex(index: Int): goods?*/

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(vararg goods: goods)

    @Delete
    fun delete(good: goods)
}