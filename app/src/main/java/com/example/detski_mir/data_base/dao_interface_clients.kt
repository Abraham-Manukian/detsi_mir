

import androidx.room.*
import androidx.room.Dao
import clients
@Dao
interface clientsDao {
    @Query("SELECT * FROM clients")
    fun getAllClients(): List<clients>

    @Query("SELECT * FROM clients WHERE name_clients LIKE :name")
    fun getClientsByName(name: String): List<clients>

    @Insert
    fun insertClients(clients: clients)

    @Update
    fun updateClients(clients: clients)

    @Delete
    fun deleteClients(clients: clients)
}