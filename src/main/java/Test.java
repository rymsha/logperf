import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test
{
    private static final Logger LOG = LoggerFactory.getLogger( Test.class );

    public static void main( String[] args )
    {
        final long start = System.nanoTime();
        for ( int i = 0; i < 1000000; i++ )
        {
            LOG.info( "test {}", i );
        }

        System.out.println( "Took " + ( System.nanoTime() - start ) / 1000000000 + "s" );
    }
}
