package dsa;
import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Ignacio on 17/04/2017.
 */
@Path("/json")
@Singleton
public class JSONService {
    protected List<User> users;
    public JSONService(){
        users=new ArrayList<User>();
        User a=new User();
        a.setName("Bruno");
        a.setCorreo("Brunomail");
        a.setId(2);
        users.add(a);
    }
    @GET
    @Path("/got/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getList(@PathParam("id") int id){
        System.out.println("asdfgh");
        return users.get(id);
    }
    @POST
    @Path("/set")
    @Produces(MediaType.TEXT_PLAIN)
    public Response setUser(User user){
        System.out.println("dsadas");
        String result = "Usuario : " + user;
        return Response.status(201).entity(result).build();
    }
    @POST
    @Path("/set1")
    @Produces(MediaType.APPLICATION_JSON)
    public User setUser1(User user){
        System.out.println("dsadas");
        return user;
    }
}
