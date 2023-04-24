
import androidx.room.*
import androidx.room.Dao
import com.example.detski_mir.data_base.Auth
import kotlinx.coroutines.flow.Flow


@Dao
interface Dao {
    @Insert
    fun insertauth(auth: Auth)
    @Query("SELECT * FROM auths")
    fun getAll(): Flow<List<Auth>>
}