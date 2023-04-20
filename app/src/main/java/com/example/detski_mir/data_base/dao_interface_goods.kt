
import androidx.room.*
import com.example.detski_mir.sampledata.goods

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