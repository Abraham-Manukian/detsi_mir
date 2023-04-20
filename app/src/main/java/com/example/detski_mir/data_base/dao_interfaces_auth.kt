
import androidx.room.*
import com.example.detski_mir.sampledata.auth

@Dao
interface authDao {

    @Query("SELECT * FROM auth WHERE login = :login")
    fun getByLogin(login: String): auth?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertOrUpdate(entity: auth)

    @Delete
    fun delete(entity: auth)

}